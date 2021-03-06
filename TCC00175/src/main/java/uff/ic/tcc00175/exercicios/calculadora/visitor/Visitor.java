package uff.ic.tcc00175.exercicios.calculadora.visitor;

import uff.ic.tcc00175.exercicios.calculadora.interpreter.Coseno;
import uff.ic.tcc00175.exercicios.calculadora.interpreter.Divisao;
import uff.ic.tcc00175.exercicios.calculadora.interpreter.Literal;
import uff.ic.tcc00175.exercicios.calculadora.interpreter.Multiplicacao;
import uff.ic.tcc00175.exercicios.calculadora.interpreter.Seno;
import uff.ic.tcc00175.exercicios.calculadora.interpreter.Soma;
import uff.ic.tcc00175.exercicios.calculadora.interpreter.Subtracao;
import uff.ic.tcc00175.exercicios.calculadora.interpreter.Tangente;
import uff.ic.tcc00175.exercicios.calculadora.interpreter.Variavel;

public abstract class Visitor {

    public abstract void visitLiteral(Literal expr);

    public abstract void visitVariavel(Variavel expr);

    public abstract void visitSoma(Soma expr);

    public abstract void visitSubtracao(Subtracao expr);

    public abstract void visitMultiplicacao(Multiplicacao expr);

    public abstract void visitDivisao(Divisao expr);

    public abstract void visitSeno(Seno expr);

    public abstract void visitCoseno(Coseno expr);

    public abstract void visitTangente(Tangente expr);

}
