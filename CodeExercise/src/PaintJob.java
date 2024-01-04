// USER INPUT

public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.26, 0.75));
    }
    public static int getBucketCount(
        double width, double height, double areaPerBucket, int extraBucket
        ) {
            if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBucket < 0) return -1;
            if (extraBucket == 0) getBucketCount(width, height, areaPerBucket);
            int returnBuckets;
            returnBuckets = getBucketCount(width * height, areaPerBucket) - extraBucket;
            return returnBuckets;
    }
    public static int getBucketCount(
        double width, double height, double areaPerBucket
        ) {
            if (width <= 0 || height <= 0 || areaPerBucket <= 0) return -1;
            double returnBuckets;
            returnBuckets = Math.ceil(width * height / areaPerBucket);
            return (int) returnBuckets;
    }
    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) return -1;
        double returnBuckets;
        returnBuckets = Math.ceil(area / areaPerBucket);
        return (int) returnBuckets;
    }
}
