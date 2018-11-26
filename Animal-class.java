class Animal {
  private String type;
  private String sounds[];
	
  public String getSound() {
    double r = Math.random();
    for (int i = 0; i < this.sounds.length; i++) {
      if (i / this.sounds.length <= r && r < (i + 1) / this.sounds.length) {
        return sounds[i - 1];
      }
    }
  }
  public String getType() {
    return type;
  }
}  
