package com.pbo.jdbc;

class barang {
    private String NamaItem;
    private double Harga;
    private int Jumlah;
    public barang(String NamaItem, double Harga, int Jumlah) {
        this.itemName = NamaItem;
        this.price = Harga;
        this.quantity = Jumlah;
    }
    public double getHarga() {
        return Harga;
    }
    public int getJumlah() {
        return Jumlah;
    }
    public String getNamaItem() {
        return NamaItem;
    }
}