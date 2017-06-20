package com.Entity;
//车品牌
public class Brand {

	private int brand_id;        //品牌id
	private String brand_name;   //品牌名称
	private String brand_logo;	 //品牌logo
	private String arctic_num;	 //车型数量
	
	private String cre_time;     //创建日期

	public int getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(int brand_id) {
		this.brand_id = brand_id;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	public String getBrand_logo() {
		return brand_logo;
	}

	public void setBrand_logo(String brand_logo) {
		this.brand_logo = brand_logo;
	}

	public String getArctic_num() {
		return arctic_num;
	}

	public void setArctic_num(String arctic_num) {
		this.arctic_num = arctic_num;
	}

	public String getCre_time() {
		return cre_time;
	}

	public void setCre_time(String cre_time) {
		this.cre_time = cre_time;
	}

	@Override
	public String toString() {
		return "Brand [brand_id=" + brand_id + ", brand_name=" + brand_name + ", brand_logo=" + brand_logo
				+ ", arctic_num=" + arctic_num + ", cre_time=" + cre_time + "]";
	}

	
}
