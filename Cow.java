class Cow implements Animal { 
  private String type, sound;

  public Cow() {
    this.type = "Cow";
    this.sound = "Moo";
  }
  public Cow(String type, String sound) {
    this.type = type;
    this.sound = sound;
  }

  public String getType() { 
    return type; 
  }
  public String getSound() { 
    return sound; 
  }
}
