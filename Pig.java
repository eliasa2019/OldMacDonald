class Pig implements Animal {     
  private String type, sound;

  public Pig() {
    this.type = "Pig";
    this.sound = "Oink";
  }
  public Pig(String type, String sound) {
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
