package sample;

public class Pizza
{
    private double price;
    private boolean[] pizzaToppings = new boolean[12];
    private int[] pizzaSpread = new int[12];

    private String size, pizzaType;

    //cheese and sauce
    private boolean nocheese,
                    regularcheese,
                    extracheese,
                    noSauce,
                    regularSauce,
                    extraSauce;
    // cheese and sauce spread
    private int nocheeseSpread,
                regcheeseSpread,
                extracheeseSpread,
                noSauceSpread,
                regularSauceSpread,
                getNocheeseSpread,
                extraSauceSpread;

    //toppings
    private boolean pepperoni,
                    sausage,
                    ham,
                    canadianBacon,
                    mushrooms,
                    tomatoes,
                    pineapple,
                    onions,
                    greenPeppers,
                    blkOlives,
                    spinach,
                    jalapeno;

    //topping spread values, 0,1 or 2
    private int pepperoniSpread,
                sausageSpread,
                hamSpread,
                canadianBaconSpread,
                mushroomsSpread,
                tomatoesSpread,
                pineappleSpread,
                onionsSpread,
                greenPeppersSpread,
                blkOlivesSpread,
                spinachSpread,
                jalapenoSpread;


    public Pizza()
    {
        this.nocheese= this.regularcheese= this.extracheese= this.noSauce= this.regularSauce= this.extraSauce=false;

        this.nocheeseSpread= this.regcheeseSpread= this.extracheeseSpread= this.noSauceSpread=
                this.regularSauceSpread= this.getNocheeseSpread= this.extraSauceSpread=0;

        this.pepperoni= this.sausage= this.ham= this.canadianBacon= this.mushrooms= this.tomatoes=
                this.pineapple= this.onions= this.greenPeppers= this.blkOlives= this.spinach= this.jalapeno=false;

        this.pepperoniSpread= this.sausageSpread= this.hamSpread= this.canadianBaconSpread=
                this.mushroomsSpread= this.tomatoesSpread= this.pineappleSpread= this.onionsSpread=
                        this.greenPeppersSpread= this.blkOlivesSpread= this.spinachSpread= this.jalapenoSpread=0;
    }


    public void addPrice(double amount)
    {
        this.price+=amount;
    }
  //  With each addition of a topping, a price increment is added to variable price

    public void removePrice(double amount)
    {
        this.price-=amount;
        if(price<0.0)
            price=0.0;
    }


  //    Takes user input from buttons to assign what size pizza ordered to variable size
    public void chooseSize(String amount)
    {
        if(!amount.equals("small") && !amount.equals("medium") && !amount.equals("large") && !amount.equals("extraLarge"))
        {
            //throw exception
        }
        this.size = amount;
    }


    //   Takes user input from buttons to assign what type of pizza ordered to variable pizzaType
    public void chooseType(String type)
    {
        if(!type.equals("regular")&&!type.equals("pan")&&!type.equals("deepDish"))
        {
            //throw exception
        }
         this.pizzaType = type;
    }

    // the type of cheese desired, makes all other cheese types false
    public void chooseCheese(String cheese)
    {
        switch(cheese)
        {
            case "nocheese":
                nocheese=true;
                regularcheese = extracheese = false;
                break;
            case "regularcheese":
                regularcheese = true;
                nocheese = extracheese = false;
                break;
            case "extracheese":
                extracheese = true;
                nocheese = regularcheese= false;
                break;
        }
    }


    //choose the sauce you want, makes all other sauce types false
    public void chooseSauce(String sauce)
    {
        switch(sauce)
        {
            case "nosauce":
                noSauce=true;
                regularSauce=extraSauce=false;
                break;
            case "regularsauce":
                regularSauce = true;
                noSauce = extraSauce=false;
                break;
            case "extrasauce":
                extraSauce=true;
                noSauce=regularSauce=false;
                break;
        }
    }


    //assigns numeral value of cheese spread (0-2)
    public void chooseCheeseSpread(int spd)
    {
    if(nocheese)
        nocheeseSpread=spd;
    else if(regularcheese)
        regcheeseSpread=spd;
    else
        extracheeseSpread=spd;
    }

//assigns numeral value of sauce spread (0-2)
    public void chooseSauceSpread(int spd)
    {
        if(noSauce)
            noSauceSpread=spd;
        else if(regularSauce)
            regularSauceSpread = spd;
        else
            extraSauceSpread=spd;
    }

//make this topping true and includes it in the toppings array
    public void addToppings(String topping)
    {
        switch(topping)
        {
            case "pepperoni":
                this.pepperoni=true;
                topA(0,true);
                break;
            case "sausage":
                this.sausage=true;
                topA(1,true);
                break;
            case "ham":
                this.ham=true;
                topA(2,true);
                break;
            case "canadianBacon":
                this.canadianBacon=true;
                topA(3,true);
                break;
            case "mushrooms":
                this.mushrooms=true;
                topA(4,true);
                break;
            case "tomatoes":
                this.tomatoes=true;
                topA(5,true);
                break;
            case "pineapple":
                this.pineapple=true;
                topA(6,true);
                break;
            case "onions":
                this.onions=true;
                topA(7,true);
                break;
            case "greenPeppers":
                this.greenPeppers=true;
                topA(8,true);
                break;
            case "blkOlives":
                this.blkOlives=true;
                topA(9,true);
                break;
            case "spinach":
                this.spinach=true;
                topA(10,true);
                break;
            case "jalapeno":
                this.jalapeno=true;
                topA(11,true);
                break;
            default:
                //throw exception

        }
    }
 //   With each added topping, a space in the array pizzaToppings will updated according to each specific topping


    //removes the selected topping by making the variable and it's spot in the array false
    public void removeToppings(String topping)
    {
        switch(topping)
        {
            case "pepperoni":
                this.pepperoni=false;
                topA(0,false);
                break;
            case "sausage":
                this.sausage=false;
                topA(1,false);
                break;
            case "ham":
                this.ham=false;
                topA(2,false);
                break;
            case "canadianBacon":
                this.canadianBacon=false;
                topA(3,false);
                break;
            case "mushrooms":
                this.mushrooms=false;
                topA(4,false);
                break;
            case "tomatoes":
                this.tomatoes=false;
                topA(5,false);
                break;
            case "pineapple":
                this.pineapple=false;
                topA(6,false);
                break;
            case "onions":
                this.onions=false;
                topA(7,false);
                break;
            case "greenPeppers":
                this.greenPeppers=false;
                topA(8,false);
                break;
            case "blkOlives":
                this.blkOlives=false;
                topA(9,false);
                break;
            case "spinach":
                this.spinach=false;
                topA(10,false);
                break;
            case "jalapeno":
                this.jalapeno=false;
                topA(11,false);
                break;
            default:
                //throw exception

        }
    }

    //  Updates the toppings in the array
    public void topA(int i, boolean s)
    {
        this.pizzaToppings[i]=s;
    }

    public void addSpread(String topping, int s)
     {
         /* 0:left
            1:right
            2:whole
          */

         //don't let 's' be above 2, throw exception

        switch(topping)
        {
            case "pepperoni":
                this.pepperoniSpread=s;
                spdA(0,s);
                break;
            case "sausage":
                this.sausageSpread=s;
                spdA(1,s);
                break;
            case "ham":
                this.hamSpread=s;
                spdA(2,s);
                break;
            case "canadianBacon":
                this.canadianBaconSpread=s;
                spdA(3,s);
                break;
            case "mushrooms":
                this.mushroomsSpread=s;
                spdA(4,s);
                break;
            case "tomatoes":
                this.tomatoesSpread=s;
                spdA(5,s);
                break;
            case "pineapple":
                this.pineappleSpread=s;
                spdA(6,s);
                break;
            case "onions":
                this.onionsSpread=s;
                spdA(7,s);
                break;
            case "greenPeppers":
                this.greenPeppersSpread=s;
                spdA(8,s);
                break;
            case "blkOlives":
                this.blkOlivesSpread=s;
                spdA(9,s);
                break;
            case "spinach":
                this.spinachSpread=s;
                spdA(10,s);
                break;
            case "jalapeno":
                this.jalapenoSpread=s;
                spdA(11,s);
                break;
            default:
                //throw exception
        }
     }
 //   With each topping added, an update will be made to the array pizzaSpread to specify what type of spread according to each topping.



    public void spdA(int i, int s)
    {
        //don't let 's' be above 2, throw exception
        this.pizzaSpread[i]=s;
    }
    //updates the topping spread in the array

}
