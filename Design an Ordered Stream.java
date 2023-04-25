class OrderedStream {
  int ptr=0;
  String[] str;
  public OrderedStream(int n) {
    str= new String[n];
  }
  public List<String> insert(int idKey, String value) {
    List<String> list= new ArrayList();
    str[idKey-1]=value;
    while(ptr<str.length && str[ptr]!=null){
      list.add(str[ptr]);
      ptr++;
    }
    return list;
  }
}
    
    
  
