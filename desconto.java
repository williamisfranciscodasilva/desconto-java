import javax.swing.JOptionPane;
class desconto
{
    public static void main(String args[])
    {
        String nome;
        Float val_com, porc, desc, val_tot;

        nome = JOptionPane.showInputDialog("Digite o nome do cliente: ");
        val_com = Float.parseFloat(
        JOptionPane.showInputDialog("Digite o valor da compra: "));

        if (val_com >= 500)
        {
            porc = 20f;
        }
        else if (val_com <= 200)
        {
            porc = 10f;
        }
        else
        {
            porc = 15f;
        }

        desc = (val_com / 100) * porc;
        val_tot = val_com - desc;

        JOptionPane.showMessageDialog(null,"Cliente: "+nome+ "\nValor da compra: "+val_com+
        "\nPorcentagem de desconto: "+porc+"\nValor do desconto: "+desc+
        "\nTotal a pagar: "+val_tot);

        System.out.println("Cliente: "+nome);
        System.out.println("Valor da compra: "+val_com);
        System.out.println("Porcentagem de desconto: "+porc);
        System.out.println("Valor do desconto: "+desc);
        System.out.println("Total a pagar: "+val_tot);
    }
}