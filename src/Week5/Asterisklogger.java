package Week5;

class AsteriskLogger implements Logger {
	  @Override
	  public void log(String note) {
	    System.out.println("***" + note + "***");
	  }

	  @Override
	  public void error(String note) {
	    int stringLength = note.length();
	    StringBuilder nw = new StringBuilder("************");
	    while (stringLength-- >= 0)
	      nw.append("*");
	    System.out.println(nw.toString());
	    System.out.println("***Error: " + note + "***");
	    stringLength = note.length();
	    StringBuilder sw = new StringBuilder("************");
	    while (stringLength-- >= 0)
	      sw.append("*");
	    System.out.println(sw.toString());
	  }
	}
