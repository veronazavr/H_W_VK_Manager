package ru.netology.domain;

public class Geo {
    private String type;
    private String coordinates;
    private int idPlace;
    private String titlePlace;
    private int latitudePlace;
    private int longitudePlace;
    private int dataCreated;
    private String iconPlace;  //    иконка места, URL изображения
    private int countCheckins; //    число отметок в этом месте
    private int cityId;
    private String addressPlace;  //    адрес места

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public int getIdPlace() {
        return idPlace;
    }

    public void setIdPlace(int idPlace) {
        this.idPlace = idPlace;
    }

    public String getTitlePlace() {
        return titlePlace;
    }

    public void setTitlePlace(String titlePlace) {
        this.titlePlace = titlePlace;
    }

    public int getLatitudePlace() {
        return latitudePlace;
    }

    public void setLatitudePlace(int latitudePlace) {
        this.latitudePlace = latitudePlace;
    }

    public int getLongitudePlace() {
        return longitudePlace;
    }

    public void setLongitudePlace(int longitudePlace) {
        this.longitudePlace = longitudePlace;
    }

    public int getDataCreated() {
        return dataCreated;
    }

    public void setDataCreated(int dataCreated) {
        this.dataCreated = dataCreated;
    }

    public String getIconPlace() {
        return iconPlace;
    }

    public void setIconPlace(String iconPlace) {
        this.iconPlace = iconPlace;
    }

    public int getCountCheckins() {
        return countCheckins;
    }

    public void setCountCheckins(int countCheckins) {
        this.countCheckins = countCheckins;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getAddressPlace() {
        return addressPlace;
    }

    public void setAddressPlace(String addressPlace) {
        this.addressPlace = addressPlace;
    }
}
