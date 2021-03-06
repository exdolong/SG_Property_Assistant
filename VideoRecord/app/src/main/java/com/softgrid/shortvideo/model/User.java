package com.softgrid.shortvideo.model;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by tianfeng on 2018/6/5.
 */

public class User {

    private String id;
    private String name;
    private String email;
    private String pass;
    private String nric;            //身份证号
    private String tel;
    private String tel2;
    private String address;
    private String image;
    private String company;
    private String intro;
    private ArrayList<Tag> business;
    private String charge;
    private int rate;
    private ArrayList<Tag> tags;
    private int type;
    private int channel;
    private String wechat;
    private long birthday;
    private int gender;
    private long createAt;
    private long updateAt;
    private long loginAt;

    public User(boolean test){
        if (test){
            name = "田峰";
            email = "feng.tian@exdorean.com";
            tel = "15928571421";
            image = "http://fdfs.xmcdn.com/group23/M01/15/2B/wKgJL1gYYjzxW7fQAAWaMAvliP8961_mobile_meduim.jpg";
            company = "成都柔联物联网络科技有限公司";
            intro = "师从谢雁鸣研究员，以绝经后骨质疏松症、中风病等为切入点，开展高危人群发病相关危险因素和中医证候要素的研究，进行高危人群疾病早期预测模型构建方法研究。开展中医临床研究随机方案设计、数据管理和统计分析工作";
            birthday = System.currentTimeMillis();
            rate = new Random().nextInt(60);

            tags = new ArrayList<>();
            tags.add(new Tag(true));
            tags.add(new Tag(true));
            tags.add(new Tag(true));
            tags.add(new Tag(true));

            business = new ArrayList<>();
            business.add(new Tag(true));
            business.add(new Tag(true));
            business.add(new Tag(true));
            business.add(new Tag(true));
            business.add(new Tag(true));
            business.add(new Tag(true));
            business.add(new Tag(true));
            business.add(new Tag(true));
            charge = "总房价1%";
        }
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNric() {
        return nric;
    }

    public void setNric(String nric) {
        this.nric = nric;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public ArrayList<Tag> getBusiness() {
        return business;
    }

    public void setBusiness(ArrayList<Tag> business) {
        this.business = business;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public ArrayList<Tag> getTags() {
        return tags;
    }

    public void setTags(ArrayList<Tag> tags) {
        this.tags = tags;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public long getBirthday() {
        return birthday;
    }

    public void setBirthday(long birthday) {
        this.birthday = birthday;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
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

    public long getLoginAt() {
        return loginAt;
    }

    public void setLoginAt(long loginAt) {
        this.loginAt = loginAt;
    }
}
