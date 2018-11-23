class Chick implements Animal {     
  private String type, sound;

  public Chick() {
    this.type = "Chick";
    this.sound = "Cluck";
  }
  public Chick(String type, String sound) {
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
