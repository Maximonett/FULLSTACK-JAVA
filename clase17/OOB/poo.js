var auto="Renault";

//definimos un objeto

var miAuto=new Object();

//popiedades del objeto
miAuto.marca='Renault';
miAuto.tipo='Clio';
miAuto.modelo=2015;

console.log("Marca: "+miAuto.marca);
console.log("Marca: "+miAuto.tipo);
console.log("Marca: "+miAuto.modelo);

//otro objeto

var miSegundoAuto={
    //propiedades
    marca:'Fiat',
    tipo:'Cronos',
    modelo:'2021',
    cantCombustible:4,
    //metodos
    detalleAuto: function(){return "Marca: "+this.marca+ "Tipo: "+this.tipo},

    acelerar:function()
    {
        if(this.cantCombustible>0)
        {
            this.cantCombustible--;
            return "El auto acelero, restan .."+this.cantCombustible+" litro de nafta" ;
        }else
        {
            return "Hay que cargar nafta";
        }
    }
}
console.log(miSegundoAuto.marca);
console.log(miSegundoAuto.detalleAuto());

console.log(miSegundoAuto.acelerar());
console.log(miSegundoAuto.acelerar());
console.log(miSegundoAuto.acelerar());
console.log(miSegundoAuto.acelerar());
console.log(miSegundoAuto.acelerar());
