// API GRAFICA Topazion 0.1

#include <TopazionCore.h>

int main() {
    
}


class Topazion {
    private:
        int oi = 0;

    public:
    Topazion() { // metodo construtor

    }

    bool begin() {
        if (SDL_Init(SDL_INIT_VIDEO) != 0) { // inicializa o video
            printf("Erro: %s\n", SDL_GetError()); // sdlgeterror mostra o ultimo erro da sdl
            return false;
        }
        return true;
    }


}











































