
package violao.prototype;

public abstract class ViolaoPrototype implements Cloneable {
    public abstract void exibirInfo();

    @Override
    public ViolaoPrototype clone() {
        try {
            return (ViolaoPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
