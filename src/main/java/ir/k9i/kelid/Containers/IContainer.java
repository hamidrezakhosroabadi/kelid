
package ir.k9i.kelid.Containers;

interface IContainer<Type> {
    public void push(String key, Type value);

    public Type pull(String key);

    public boolean containsKey(String key);

    public boolean containsValue(String key, Type value);

    public void remove(String key);
}