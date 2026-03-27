class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> h = new HashSet<>();
        for(List<String> path : paths)
            h.add(path.get(0));
        for(List<String> path : paths)
            if(!h.contains(path.get(1)))
                return path.get(1);
        return "";
    }
}