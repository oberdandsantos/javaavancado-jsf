package br.com.allianz.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Livro {

	private int id;
	private String titulo;
	private String autor;
	private Date dataPublicacao;
	private double preco;
	

	public Livro() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Livro(int id, String titulo, String autor, Date dataPublicacao, double preco) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.dataPublicacao = dataPublicacao;
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Date getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}


	//m�todo para receber a data do formulario
	public void setDataString(String dataString) {
		try {
			Date data = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);
			this.setDataPublicacao(data);
		} catch (Exception e) {
           this.setDataPublicacao(new Date());
		}
	}
	
	
}
