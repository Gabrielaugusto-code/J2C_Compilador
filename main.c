
#include <stdio.h>
#include <math.h>

#include <SDL2/SDL.h>
#include <GL/gl.h>

#define PI 3.14159265358979323846

// ==========================================
// CAMERA
// ==========================================

typedef struct
{
    float x, y, z;

    float yaw;
    float pitch;

    float velocidade;
    float sensibilidade;

} Camera;

Camera camera =
{
    0.0f, 0.0f, 5.0f,
    0.0f, 0.0f,
    5.0f, 0.15f
};

// ==========================================
// PROJECTION
// ==========================================

void configurarProjecao(int largura, int altura)
{
    if (altura == 0)
        altura = 1;

    glViewport(0, 0, largura, altura);

    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();

    float proporcao = (float)largura / altura;

    float znear = 0.1f;
    float zfar = 1000.0f;
    float fov = 70.0f;

    float top = znear * tanf((fov * PI / 180.0f) / 2.0f);
    float right = top * proporcao;

    glFrustum(
        -right, right,
        -top, top,
        znear, zfar
    );

    glMatrixMode(GL_MODELVIEW);
}

// ==========================================
// CAMERA MOVEMENT
// ==========================================

void atualizarCamera(float delta, const Uint8 *teclas)
{
    float velocidade = camera.velocidade * delta;

    float yawRad = camera.yaw * PI / 180.0f;

    float frenteX = sinf(yawRad);
    float frenteZ = -cosf(yawRad);

    float direitaX = cosf(yawRad);
    float direitaZ = sinf(yawRad);

    float movimentoX = 0.0f;
    float movimentoZ = 0.0f;

    if (teclas[SDL_SCANCODE_W])
    {
        movimentoX += frenteX;
        movimentoZ += frenteZ;
    }

    if (teclas[SDL_SCANCODE_S])
    {
        movimentoX -= frenteX;
        movimentoZ -= frenteZ;
    }

    if (teclas[SDL_SCANCODE_D])
    {
        movimentoX += direitaX;
        movimentoZ += direitaZ;
    }

    if (teclas[SDL_SCANCODE_A])
    {
        movimentoX -= direitaX;
        movimentoZ -= direitaZ;
    }

    // Normaliza o movimento diagonal
    float comprimento = sqrtf(
        movimentoX * movimentoX +
        movimentoZ * movimentoZ
    );

    if (comprimento > 0.0f)
    {
        movimentoX /= comprimento;
        movimentoZ /= comprimento;
    }

    camera.x += movimentoX * velocidade;
    camera.z += movimentoZ * velocidade;

    if (teclas[SDL_SCANCODE_SPACE])
        camera.y += velocidade;

    if (teclas[SDL_SCANCODE_LCTRL])
        camera.y -= velocidade;

    if (teclas[SDL_SCANCODE_LSHIFT])
    {
        camera.x += movimentoX * velocidade * 2.0f;
        camera.z += movimentoZ * velocidade * 2.0f;
    }
}

// ==========================================
// CAMERA ROTATION
// ==========================================

void rotacionarCamera(int mouseX, int mouseY)
{
    camera.yaw += mouseX * camera.sensibilidade;
    camera.pitch -= mouseY * camera.sensibilidade;

    // Limita a visão vertical
    if (camera.pitch > 89.0f)
        camera.pitch = 89.0f;

    if (camera.pitch < -89.0f)
        camera.pitch = -89.0f;
}

// ==========================================
// VIEW MATRIX
// ==========================================

void aplicarCamera(void)
{
    glMatrixMode(GL_MODELVIEW);
    glLoadIdentity();

    glRotatef(-camera.pitch, 1.0f, 0.0f, 0.0f);
    glRotatef(-camera.yaw, 0.0f, 1.0f, 0.0f);

    glTranslatef(
        -camera.x,
        -camera.y,
        -camera.z
    );
}

// ==========================================
// STATIC 3D CUBE
// ==========================================

void desenharCubo(void)
{
    glBegin(GL_QUADS);

    // Frente
    glColor3f(1, 0, 0);
    glVertex3f(-1, -1,  1);
    glVertex3f( 1, -1,  1);
    glVertex3f( 1,  1,  1);
    glVertex3f(-1,  1,  1);

    // Trás
    glColor3f(0, 1, 0);
    glVertex3f( 1, -1, -1);
    glVertex3f(-1, -1, -1);
    glVertex3f(-1,  1, -1);
    glVertex3f( 1,  1, -1);

    // Direita
    glColor3f(0, 0, 1);
    glVertex3f(1, -1,  1);
    glVertex3f(1, -1, -1);
    glVertex3f(1,  1, -1);
    glVertex3f(1,  1,  1);

    // Esquerda
    glColor3f(1, 1, 0);
    glVertex3f(-1, -1, -1);
    glVertex3f(-1, -1,  1);
    glVertex3f(-1,  1,  1);
    glVertex3f(-1,  1, -1);

    // Cima
    glColor3f(1, 0, 1);
    glVertex3f(-1, 1,  1);
    glVertex3f( 1, 1,  1);
    glVertex3f( 1, 1, -1);
    glVertex3f(-1, 1, -1);

    // Baixo
    glColor3f(0, 1, 1);
    glVertex3f(-1, -1, -1);
    glVertex3f( 1, -1, -1);
    glVertex3f( 1, -1,  1);
    glVertex3f(-1, -1,  1);

    glEnd();
}

// ==========================================
// MAIN
// ==========================================

int main(int argc, char *argv[])
{
    if (SDL_Init(SDL_INIT_VIDEO) != 0)
    {
        printf("Erro SDL: %s\n", SDL_GetError());
        return 1;
    }

    SDL_GL_SetAttribute(SDL_GL_CONTEXT_MAJOR_VERSION, 2);
    SDL_GL_SetAttribute(SDL_GL_CONTEXT_MINOR_VERSION, 1);
    SDL_GL_SetAttribute(SDL_GL_DOUBLEBUFFER, 1);
    SDL_GL_SetAttribute(SDL_GL_DEPTH_SIZE, 24);

    SDL_Window *janela = SDL_CreateWindow(
        "J2C - 3D Camera",
        SDL_WINDOWPOS_CENTERED,
        SDL_WINDOWPOS_CENTERED,
        1000, 700,
        SDL_WINDOW_OPENGL | SDL_WINDOW_RESIZABLE
    );

    if (!janela)
    {
        printf("Erro janela: %s\n", SDL_GetError());
        SDL_Quit();
        return 1;
    }

    SDL_GLContext contexto = SDL_GL_CreateContext(janela);

    if (!contexto)
    {
        printf("Erro OpenGL: %s\n", SDL_GetError());
        SDL_DestroyWindow(janela);
        SDL_Quit();
        return 1;
    }

    SDL_GL_SetSwapInterval(1);

    glEnable(GL_DEPTH_TEST);

    int executando = 1;
    int mouseAtivo = 0;

    Uint64 tempoAnterior = SDL_GetPerformanceCounter();

    configurarProjecao(1000, 700);

    printf("J2C 3D Engine iniciada!\n");

    while (executando)
    {
        Uint64 tempoAtual = SDL_GetPerformanceCounter();

        float delta =
            (float)(tempoAtual - tempoAnterior) /
            (float)SDL_GetPerformanceFrequency();

        tempoAnterior = tempoAtual;

        if (delta > 0.1f)
            delta = 0.1f;

        SDL_Event evento;

        while (SDL_PollEvent(&evento))
        {
            if (evento.type == SDL_QUIT)
                executando = 0;

            if (evento.type == SDL_KEYDOWN &&
                evento.key.keysym.scancode == SDL_SCANCODE_ESCAPE)
            {
                executando = 0;
            }

            // Ativa camera ao pressionar botão direito
            if (evento.type == SDL_MOUSEBUTTONDOWN &&
                evento.button.button == SDL_BUTTON_RIGHT)
            {
                mouseAtivo = 1;
                SDL_SetRelativeMouseMode(SDL_TRUE);
            }

            // Libera camera ao soltar botão direito
            if (evento.type == SDL_MOUSEBUTTONUP &&
                evento.button.button == SDL_BUTTON_RIGHT)
            {
                mouseAtivo = 0;
                SDL_SetRelativeMouseMode(SDL_FALSE);
            }

            if (evento.type == SDL_MOUSEMOTION && mouseAtivo)
            {
                rotacionarCamera(
                    evento.motion.xrel,
                    evento.motion.yrel
                );
            }

            if (evento.type == SDL_WINDOWEVENT &&
                evento.window.event == SDL_WINDOWEVENT_SIZE_CHANGED)
            {
                configurarProjecao(
                    evento.window.data1,
                    evento.window.data2
                );
            }

            if (evento.type == SDL_WINDOWEVENT &&
                evento.window.event == SDL_WINDOWEVENT_FOCUS_LOST)
            {
                mouseAtivo = 0;
                SDL_SetRelativeMouseMode(SDL_FALSE);
            }
        }

        const Uint8 *teclas = SDL_GetKeyboardState(NULL);

        atualizarCamera(delta, teclas);

        // Renderização
        glClearColor(0.08f, 0.08f, 0.12f, 1.0f);

        glClear(
            GL_COLOR_BUFFER_BIT |
            GL_DEPTH_BUFFER_BIT
        );

        aplicarCamera();

        // O cubo permanece na origem do mundo
        desenharCubo();

        SDL_GL_SwapWindow(janela);
    }

    SDL_SetRelativeMouseMode(SDL_FALSE);

    SDL_GL_DeleteContext(contexto);
    SDL_DestroyWindow(janela);
    SDL_Quit();

    return 0;
}
