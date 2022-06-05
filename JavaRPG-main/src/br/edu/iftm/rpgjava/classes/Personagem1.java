package br.edu.iftm.rpgjava.classes;

public class Personagem1 {
    
    public String nome;
    public String classe;
    public int forca;
    public int destreza;
    public int agilidade;
    public int inteligencia;
    public int carisma;
    public int resistencia;
    public int vida;
    public int estamina;
    public int sorte;
    public int mana;
    public Armadura armadura;
    public Arma arma;

    public Personagem1(String nome, int forca, int destreza, int agilidade, int inteligencia,
                     int carisma, int resistencia, int vida, int estamina, int sorte,
                     int mana) {
        this.nome = nome;
        this.forca = forca;
        this.destreza = destreza;
        this.agilidade = agilidade;
        this.inteligencia = inteligencia;
        this.carisma = carisma;
        this.resistencia = resistencia;
        this.vida = vida;
        this.estamina = estamina;
        this.sorte = sorte;
        this.mana = mana;
    }

    //metodos da classe
    public int atacar(int valorDado, int defesaInimigo) {
        int valorAtaque = 0;
        if (valorDado < 2) { //falha critica
            System.out.println("O Ataque falhou!!!");
        } else {
            if(arma != null){
                valorAtaque = this.arma.calculaAtaque(valorAtaque);
                arma.diminuiDurabilidade(defesaInimigo);
                if(arma.temDurabilidade() == false){
                    arma = new Arma();
                }
            }else{
                valorAtaque = this.forca + valorDado;
            }

        }
        return valorAtaque;
    }

    public void defender(int valorDoAtaque) {
        int defesaTotal = 0;
        if (armadura != null) {
            defesaTotal = armadura.calculaDefesa(this.resistencia);
        } else {
            defesaTotal = this.resistencia;
        }
        if (valorDoAtaque <= defesaTotal) {
            System.out.println("O Ataque foi defendido!!!");
        } else {
            int danoCausado = valorDoAtaque - defesaTotal;
            System.out.println("O dano causado foi de: " + danoCausado);
            //this.vida = this.vida - danoCausado
            this.vida -= danoCausado;
            armadura.diminuiDurabilidade(danoCausado);
            if (armadura.temDurabilidade() == false) {
                this.armadura = new Armadura();
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getCarisma() {
        return carisma;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEstamina() {
        return estamina;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }

    public int getSorte() {
        return sorte;
    }

    public void setSorte(int sorte) {
        this.sorte = sorte;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

}