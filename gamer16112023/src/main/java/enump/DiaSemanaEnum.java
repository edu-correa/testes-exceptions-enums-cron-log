package enump;

public enum DiaSemanaEnum {
    DOMINGO(1, "Domingo"),
    SEGUNDA(2, "Segunda-feira"),
    TERCA(3, "Terça-feira"),
    QUARTA(4, "Quarta-feira"),
    QUINTA(5, "Quinta-feira"),
    SEXTA(6, "Sexta-feira"),
    SABADO(7, "Sábado");

    private int codigo;
    private String descricao;

    DiaSemanaEnum(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static DiaSemanaEnum of(int codigo){
        switch (codigo){
            case 1:
                return DOMINGO;
            case 2:
                return SEGUNDA;
            case 3:
                return TERCA;
            case 4:
                return QUARTA;
            case 5:
                return QUINTA;
            case 6:
                return SEXTA;
            case 7:
                return SABADO;
        }


        return null;
    }
}
