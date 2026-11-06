
from pathlib import Path

diretorio = Path("D:/Projetos/J2C/1.7.3/classJava")
DadosOUT = Path("D:/Projetos/J2C/1.7.3/classJava/TXT_OUT")
DadosOUT.mkdir(parents=True, exist_ok=True)

LIMITE = 500 * 1024  # 500 KB

def DescompactarArquivosJava():
    for arquivo in diretorio.rglob("*.java"):
        if DadosOUT in arquivo.parents:
            continue

        destino = DadosOUT / (arquivo.stem + ".txt")
        conteudo = arquivo.read_text(encoding="utf-8")
        destino.write_text(conteudo, encoding="utf-8")
        print(arquivo.name)


def ConcatenarArquivosJava():
    conteudos = []
    for arquivo in diretorio.rglob("*.java"):
        if DadosOUT in arquivo.parents:
            continue

        cabecalho = (
            f"\n// ARQUIVO: {arquivo.name}\n"
            f"// DIRETORIO: {arquivo.relative_to(diretorio)}\n"
        )
        conteudos.append(cabecalho + arquivo.read_text(encoding="utf-8") + "\n")

    destino = DadosOUT / "OUTPUT_GERAL.txt"
    destino.write_text("".join(conteudos), encoding="utf-8")


def GerarConjuntos():
    conjunto = 1
    tamanho_atual = 0
    conteudos = []

    for arquivo in diretorio.rglob("*.java"):
        if DadosOUT in arquivo.parents:
            continue

        conteudo = (
            f"\n// ARQUIVO: {arquivo.name}\n"
            f"// DIRETORIO: {arquivo.relative_to(diretorio)}\n"
            + arquivo.read_text(encoding="utf-8")
            + "\n"
        )

        tamanho = len(conteudo.encode("utf-8"))

        if tamanho_atual + tamanho > LIMITE and conteudos:
            destino = DadosOUT / f"CONJUNTO_{conjunto:03}.txt"
            destino.write_text("".join(conteudos), encoding="utf-8")
            print(f"Gerado: {destino.name}")

            conjunto += 1
            tamanho_atual = 0
            conteudos = []

        conteudos.append(conteudo)
        tamanho_atual += tamanho

    if conteudos:
        destino = DadosOUT / f"CONJUNTO_{conjunto:03}.txt"
        destino.write_text("".join(conteudos), encoding="utf-8")
        print(f"Gerado: {destino.name}")


opcao = input("Descompactar 1, Concatenar 2, Gerar conjuntos 3: ")

if opcao == "1":
    DescompactarArquivosJava()
elif opcao == "2":
    ConcatenarArquivosJava()
elif opcao == "3":
    GerarConjuntos()
else:
    print("Opção inválida.")
