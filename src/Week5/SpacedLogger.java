package Week5;

class SpacedLogger implements Logger {
	  @Override
	  public void log(String note) {
	    StringBuilder sm = new StringBuilder();
	    for (char c : note.toCharArray()) {
	      sm.append(c).append(" ");
	    }
	    System.out.println(sm.toString());
	  }

	  @Override
	  public void error(String note) {
	    System.out.println("ERROR: " + spacedMessage(note));
	  }

	  private String spacedMessage(String note) {
	    StringBuilder sm = new StringBuilder();
	    for (int i = 0; i < note.length(); i++) {
	      sm.append(note.charAt(i));
	      if (i + 1 < note.length())
	        sm.append(" ");
	    }
	    return sm.toString();
	  }
}
