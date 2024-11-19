public class PriorityObject {
  private Object Object;
  private int Priority;


// The `public PriorityObject(Object Object, int Priority)` constructor in the `PriorityObject` class
// is initializing a new instance of `PriorityObject` with the provided `Object` and `Priority` values.
// It sets the `Object` property of the instance to the value passed as `Object`, and the `Priority`
// property to the value passed as `Priority`. This constructor allows you to create a new
// `PriorityObject` with specific values for the `Object` and `Priority` properties.
  public PriorityObject(Object Object, int Priority) {
    this.Object = Object;
    this.Priority = Priority;
  }

/**
 * The `getObject` function in Java returns the `Object` property of the current instance.
 * 
 * @return The method `getObject()` is returning the `Object` field of the current instance.
 */
  public Object getObject(){
    return this.Object;
  }

/**
 * The function "getPriority" returns the priority value of the object.
 * 
 * @return The `Priority` value of the current object is being returned.
 */
  public int getPriority(){
    return this.Priority;
  }

/**
 * The `toString` function returns a string representation of the object.
 * 
 * @return The `toString` method is returning a string representation of the `Object` field of the
 * current object.
 */
  public String toString(){
    return "" + this.Object;
  }
}
