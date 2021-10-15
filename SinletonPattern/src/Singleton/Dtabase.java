package Singleton;

public class Dtabase {

    private String name;

    // applying singleton
    private static Dtabase instance;
    //synchronized indica que solo una thread puede llamar este metodo a la vez, así evitamos que dos instancias se creen al mismo tiempo
    public static synchronized Dtabase getInstance(String name){ // con este metodo nos aseguramos que solo haya una instancia de
                                                    // la clase Dtabase en todo el programa
        if(null == instance){ //si no se ha creado, se crea
            instance = new Dtabase(name);
            return instance;
        }
        // como ya esta creada, devolvemos la instancia existente
        return instance;

    }
    private Dtabase(String name) { // para restringir el acceso solo para esta clase, asi no podrán crear multiples intancias
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name "+name;
    }
}
