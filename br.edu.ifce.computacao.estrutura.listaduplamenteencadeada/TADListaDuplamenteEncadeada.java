package br.edu.ifce.computacao.estrutura.listaduplamenteencadeada;

/**
 * @author talisson
 * 
 * **/

public interface TADListaDuplamenteEncadeada<T> {
	
	//	operações principais
		public void insereValor(T valor, int posicao);
		public T removeValor(int posicao);
		
	
	//	operações secundárias
		public boolean listaVazia();
		public void imprimeLista();
}
