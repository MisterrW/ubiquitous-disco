class Planet {
  private String name;
  private int size;
  private String text;

  public Planet(String name, int size) {
    this.name = name;
    this.size = size;
    this.text = String.format("Boom! %s has exploded. You sense a great disturbance in the force, as though %d voices had cried out and were suddenly silenced.", this.name, this.size);
  }

  public String getName() {
    return this.name;
  }

  public int getSize() {
    return this.size;
  }

  public void explode() {
    System.out.println(this.text);
  }
}