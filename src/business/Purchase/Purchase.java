/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Purchase;

import java.awt.image.BufferedImage;

/**
 *
 * @author mayurimore
 */
public class Purchase {
    private String productName;
    private int price;
    private String Category;
    private int quantity;
    private String contidion;
    private String contactEmail;
    private String status;
    private String comment;
    private String report;
    private String productImage;
    private String Address;
    private String StatusOfProduct;
    private String BuyRequests;
    private String contact;
    private int AvailibilityPeriod;

    public int getAvailibilityPeriod() {
        return AvailibilityPeriod;
    }

    public void setAvailibilityPeriod(int AvailibilityPeriod) {
        this.AvailibilityPeriod = AvailibilityPeriod;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getBuyRequests() {
        return BuyRequests;
    }

    public void setBuyRequests(String BuyRequests) {
        this.BuyRequests = BuyRequests;
    }

    public String getStatusOfProduct() {
        return StatusOfProduct;
    }

    public void setStatusOfProduct(String StatusOfProduct) {
        this.StatusOfProduct = StatusOfProduct;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getContidion() {
        return contidion;
    }

    public void setContidion(String contidion) {
        this.contidion = contidion;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }
    
    @Override
    public String toString(){
        return this.productName;
    }
    
    
}
