package commonLibs.Core;

import java.util.HashMap;
import java.util.List;

public class User {

    private String UUID;
    private String address;
    private String affiliateId;
    private String birthDate;
    private String brandId;
    private String btag;
    private List<String> campaigns = null;
    private String city;
    private String country;
    private String currency;
    private String email;
    private String firstName;
    private String gender;
    private String identifier;
    private String intendedAmountToSpend;
    private String languageCode;
    private String lastName;
    private String login;
    private String password;
    private String phone;
    private String phone2;
    private String phoneCode;
    private String phoneCode2;
    private String postCode;
    private String state;
    private HashMap<String, Boolean> subscriptions = new HashMap<>();

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    private String token;

    public User(String brandId) {
        long id = System.currentTimeMillis();
        birthDate = "1996-02-19";
        this.brandId = brandId;
        currency = "EUR";
        email = "test" + id + "@testmail.com";
        languageCode = "en";
        password = "Switch899!";
        phone = "668486801";
        phoneCode = "380";
        subscriptions.put("marketingMail", true);
        subscriptions.put("marketingSMS", true);
        subscriptions.put("tailorMadeEmail", true);
        subscriptions.put("tailorMadeSMS", true);

    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String acceptedTermsUUID) {
        this.UUID = acceptedTermsUUID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAffiliateId() {
        return affiliateId;
    }

    public void setAffiliateId(String affiliateId) {
        this.affiliateId = affiliateId;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getBtag() {
        return btag;
    }

    public void setBtag(String btag) {
        this.btag = btag;
    }

    public List<String> getCampaigns() {
        return campaigns;
    }

    public void setCampaigns(List<String> campaigns) {
        this.campaigns = campaigns;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getIntendedAmountToSpend() {
        return intendedAmountToSpend;
    }

    public void setIntendedAmountToSpend(String intendedAmountToSpend) {
        this.intendedAmountToSpend = intendedAmountToSpend;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public String getPhoneCode2() {
        return phoneCode2;
    }

    public void setPhoneCode2(String phoneCode2) {
        this.phoneCode2 = phoneCode2;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


}
