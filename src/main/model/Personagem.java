package main.model;

public abstract class Personagem {
    protected String nome;
    protected int hp;
    protected int ep;
    protected int forca;
    protected int inteligencia;
    protected int defesaFisica;
    protected int defesaCibernetica;
    protected int stims;
    protected int danoBase;

    public Personagem(String nome, int hp, int ep, int forca, int inteligencia, int defesaFisica, int defesaCibernetica, int stims, int danoBase) {
        this.nome = nome;
        this.hp = hp;
        this.ep = ep;
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.defesaFisica = defesaFisica;
        this.defesaCibernetica = defesaCibernetica;
        this.stims = stims;
        this.danoBase = danoBase;
    }
    public void receberDanoFisico(int dano){
        int danoFinal = dano - defesaFisica;
        if(hp < 0) hp = 0;
        hp -= danoFinal;
    }
    public void receberDanoCibernetico(int dano){
        int danoFinal = dano - defesaCibernetica;
        if(hp < 0) hp = 0;
        hp -= danoFinal;
    }
    public boolean estaVivo(){
        return hp > 0;
    }
    
    public int curar(int valor){
        if(this.stims > 0){
            this.stims -= 1;
            this.hp += valor;
            return hp;
        } else {
            return 0;
        }
    }

    public void gastarEp(int valor){
        this.ep -= valor;
        if(this.ep < 0) ep = 0;
    }   

    public String getNome() { return nome; }
    public int getHp() { return hp; }
    public int getEp() { return ep; }
    public int getStims() { return stims; }
    public int getForca() {return forca;}
    public int getDefesaFisica(){return defesaFisica; }
    public int getInteligencia(){return inteligencia; }
    public int getDefesaCibernetica(){return defesaCibernetica; }
    public int getDanoBase(){return danoBase; }

}
