#   Codigo em python que vai ler os arquivos .java e transformar em .txt, pra usar o gogle notebook para ler 
# os arquivos
#




from pathlib import Path

diretorio = Path("D:/Projetos/J2C/1.7.3/classJava")
DadosOUT = Path("D:/Projetos/J2C/1.7.3/classJava/TXT_OUT")
DadosOUT.mkdir(parents=True, exist_ok=True)

for arquivo in diretorio.rglob("*.java"):
    NomeArquivoOUT = arquivo.stem + ".txt"
    ArquivoOUT = arquivo.read_text(encoding="utf-8")
    Destino = Path(DadosOUT / NomeArquivoOUT)
    Destino.write_text(ArquivoOUT, encoding="utf-8")
    print(arquivo.name)