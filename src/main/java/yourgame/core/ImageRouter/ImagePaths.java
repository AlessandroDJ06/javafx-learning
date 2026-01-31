package yourgame.core.ImageRouter;

public enum ImagePaths {
    LOGO("/assets/images/img.png");

    private final String path;

    ImagePaths(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;

    }
}

