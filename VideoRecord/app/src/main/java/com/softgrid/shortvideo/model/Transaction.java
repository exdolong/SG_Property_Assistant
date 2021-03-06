package com.softgrid.shortvideo.model;

/**
 * Created by tianfeng on 2018/6/5.
 */

public class Transaction {

    private String id;
    private int type;
    private int total;
    private int haveLoans;
    private Building building;
    private User buyer;
    private User seller;
    private User lawyer;
    private User intermediary;
    private TransactionStatus status;
    private long buyTime;
    private long contractTime;
    private Loans loans;
    private long createAt;
    private long updateAt;

    public Transaction(){

    }

    public Transaction(boolean test){
        building = new Building(true);
        type = building.getIsResale();
        total = 3000000;
        buyer = new User(true);
        seller = new User(true);
        lawyer = new User(true);
        intermediary = new User(true);
        status = new TransactionStatus();
        buyTime = System.currentTimeMillis();
        contractTime = System.currentTimeMillis();
        loans = new Loans(true);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getHaveLoans() {
        return haveLoans;
    }

    public void setHaveLoans(int haveLoans) {
        this.haveLoans = haveLoans;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public User getLawyer() {
        return lawyer;
    }

    public void setLawyer(User lawyer) {
        this.lawyer = lawyer;
    }

    public User getIntermediary() {
        return intermediary;
    }

    public void setIntermediary(User intermediary) {
        this.intermediary = intermediary;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public void setStatus(TransactionStatus status) {
        this.status = status;
    }

    public long getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(long buyTime) {
        this.buyTime = buyTime;
    }

    public long getContractTime() {
        return contractTime;
    }

    public void setContractTime(long contractTime) {
        this.contractTime = contractTime;
    }

    public Loans getLoans() {
        return loans;
    }

    public void setLoans(Loans loans) {
        this.loans = loans;
    }

    public long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(long createAt) {
        this.createAt = createAt;
    }

    public long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(long updateAt) {
        this.updateAt = updateAt;
    }
}
