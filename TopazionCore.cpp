// API GRAFICA Topazion 0.1

#include <SDL2/SDL.h>
#include <SDL2/SDL_opengl.h>
#include <stdio.h>
#include <cstdint>

class Topazion {
    private:

    SDL_Window *janela = nullptr;


    uint8_t init() {
        if (SDL_Init(SDL_INIT_VIDEO) != 0) {
            printf("Erro: %s\n", SDL_GetError());
            return 1;
        }
        return 0;
    }

    public:

    Topazion() { // metodo construtor
        init();

    };

    void begin(const char *nomeJanela[], const char *iconeJanela[], uint16_t larguraJ, uint16_t alturaJ) { // detale icone da janela é camindo de arquivo

        janela = *SDL_CreateWindow(nomeJanela, SDL_WINDOWPOS_CENTERED, SDL_WINDOWPOS_CENTERED, larguraJ, alturaJ, SDL_WINDOW_SHOWN); // recebo um ponteiro com a tela ja formada em algum lugar da ram

    }

    void close() {
        SDL_DestroyWindow(janela);
        SDL_Quit();
    }
}

#define largura 1280
#define altura 720

void setup() {
    Topazion Game;
    Game.begin("Teste", " ", largura, altura);
}

int main(int argc, char* argv[]) {
    setup();
    printf("oi");
    return 0;
}