package com.hanifhasan007.ebangla;

import android.os.Parcel;
import android.os.Parcelable;

public class Book implements Parcelable{

    private String Titile;
    private String Writer;
    private String Publication;
    private String Category;
    private String Price;
    private String ReleaseDate;
    private String Edition;
    private String Description;
    private int Thumbnail;

    public Book() {
    }

    public Book(String titile, String category, String description, int thumbnail) {
        Titile = titile;
        Category = category;
        Description = description;
        Thumbnail = thumbnail;
    }

    public Book(String titile, String writer, String publication, String category, String price, String releaseDate, String edition, String description, int thumbnail) {
        Titile = titile;
        Writer = writer;
        Publication = publication;
        Category = category;
        Price = price;
        ReleaseDate = releaseDate;
        Edition = edition;
        Description = description;
        Thumbnail = thumbnail;
    }

    protected Book(Parcel in) {
        Titile = in.readString();
        Writer = in.readString();
        Publication = in.readString();
        Category = in.readString();
        Price = in.readString();
        ReleaseDate = in.readString();
        Edition = in.readString();
        Description = in.readString();
        Thumbnail = in.readInt();
    }

    public static final Creator<Book> CREATOR = new Creator<Book>() {
        @Override
        public Book createFromParcel(Parcel in) {
            return new Book(in);
        }

        @Override
        public Book[] newArray(int size) {
            return new Book[size];
        }
    };

    public String getWriter() {
        return Writer;
    }

    public void setWriter(String writer) {
        Writer = writer;
    }

    public String getPublication() {
        return Publication;
    }

    public void setPublication(String publication) {
        Publication = publication;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        ReleaseDate = releaseDate;
    }

    public String getEdition() {
        return Edition;
    }

    public void setEdition(String edition) {
        Edition = edition;
    }

    public String getTitile() {
        return Titile;
    }

    public String getCategory() {
        return Category;
    }

    public String getDescription() {
        return Description;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setTitile(String titile) {
        Titile = titile;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(Titile);
        parcel.writeString(Writer);
        parcel.writeString(Publication);
        parcel.writeString(Category);
        parcel.writeString(Price);
        parcel.writeString(ReleaseDate);
        parcel.writeString(Edition);
        parcel.writeString(Description);
        parcel.writeInt(Thumbnail);
    }
}
