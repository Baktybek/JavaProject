QUESTION: Given a non-empty string like "Code" return a string like "CCoCodCode".

EXAMPLE:
stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
.
.
.
public String stringSplosion(String str) {
  String n = "";
  for(int i = 1; i < str.length()+1; i++){
    n = n + str.substring(0, i);
  }
  return n;
}
