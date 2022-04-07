package com.jforce.tr.modal;

import javax.persistence.*;

@Entity
@Table(name = "Ders")
public class Ders {
	@Id
	private Integer Id;
	
	@Column(name = "dersin_adı")
	private String DersAdı;
	
	@Column(name = "dersin_kredisi")
	private Integer DersKredi;
	
	@Column(name = "ders_ortalaması")
	private Float dersOrtalaması;

	public Ders (){
		
	}

	
	public Float getDersOrtalaması() {
		return dersOrtalaması;
	}


	public void setDersOrtalaması(Float dersOrtalaması) {
		this.dersOrtalaması = dersOrtalaması;
	}


	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getDersAdı() {
		return DersAdı;
	}

	public void setDersAdı(String dersAdı) {
		DersAdı = dersAdı;
	}

	public Integer getDersKredi() {
		return DersKredi;
	}

	public void setDersKredi(Integer dersKredi) {
		DersKredi = dersKredi;
	}
	
	
}

	