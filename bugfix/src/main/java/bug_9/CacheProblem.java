package bug_9;


//????????????)))
public class CacheProblem {
    String cache;

    public static void main(String[] args) {
        final CacheProblem cacheProblem = new CacheProblem();
        cacheProblem.fullCacheInformation(cacheProblem);
        System.out.println(cacheProblem.cache.equals("cacheInfo"));//should be true, please provide few variants to fix this problem,
    }


    public void fullCacheInformation(CacheProblem cache) {
         cache.setCache("cacheInfo");
    }

    public String getCache() {
        return cache;
    }

    public void setCache(String cache) {
        this.cache = cache;
    }
}
