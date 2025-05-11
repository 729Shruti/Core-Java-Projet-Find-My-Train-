public class Platform {
    private String platform_no;
    private Train train;

    public Platform(String platform_no) {
        this.platform_no = platform_no;
    }

    public String getPlatform_no() {
        return platform_no;
    }

    public void setPlatform_no(String platform_no) {
        this.platform_no = platform_no;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    @Override
    public String toString() {
        return "Platform{" +
                "platform_no='" + platform_no + '\'' +
                ", train=" + train +
                '}';
    }
}
