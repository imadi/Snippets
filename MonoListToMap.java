List<String> strList = Arrays.asList("A","B","C");
Mono<List<String>> monoListMono = Mono.just(strList);
Mono<Map<Object, String>> monoMap= monoListMono.flatMapMany(Flux::fromIterable).collectMap(valList->{
  Map<String, Object> hashMap  = new HashMap<>();
  hashMap.put("hello", valList);
  return hashMap;
});
