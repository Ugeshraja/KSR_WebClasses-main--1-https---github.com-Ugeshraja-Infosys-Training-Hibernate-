package model;

import javax.persistence.*;

@Entity
@Table(name="fileinfo")
public class FileInfo {
    
    @Id
    @Column(name="fileid", length = 30)
    private String fileid;
    
    @Column(name="filename", length = 150)
    private String file_name;
    
    @Column(name="dateuploaded", length = 30)
    private String date_uploaded;
    
    @Column(name="owner", length = 100)
    private String owner;
    
    @Column(name="location", length = 255)
    private String file_location;

    public String getFileid() {
        return fileid;
    }

    public void setFileid(String fileid) {
        this.fileid = fileid;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public String getDate_uploaded() {
        return date_uploaded;
    }

    public void setDate_uploaded(String date_uploaded) {
        this.date_uploaded = date_uploaded;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getFile_location() {
        return file_location;
    }

    public void setFile_location(String file_location) {
        this.file_location = file_location;
    }
    
    
}
