package pojo;

public class FJusticeUser {
    private Integer userid;

    private String username;

    private String userpassword;

    private String usertime;

    private String useridentity;

    private String userdate;

    private String useremail;

    private String userphone;

    private String usernumber;

    private String userrecord;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }

    public String getUsertime() {
        return usertime;
    }

    public void setUsertime(String usertime) {
        this.usertime = usertime == null ? null : usertime.trim();
    }

    public String getUseridentity() {
        return useridentity;
    }

    public void setUseridentity(String useridentity) {
        this.useridentity = useridentity == null ? null : useridentity.trim();
    }

    public String getUserdate() {
        return userdate;
    }

    public void setUserdate(String userdate) {
        this.userdate = userdate == null ? null : userdate.trim();
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail == null ? null : useremail.trim();
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone == null ? null : userphone.trim();
    }

    public String getUsernumber() {
        return usernumber;
    }

    public void setUsernumber(String usernumber) {
        this.usernumber = usernumber == null ? null : usernumber.trim();
    }

    public String getUserrecord() {
        return userrecord;
    }

    public void setUserrecord(String userrecord) {
        this.userrecord = userrecord == null ? null : userrecord.trim();
    }
}