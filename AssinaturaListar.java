public class AssinaturaListar {
    public static void listarAssinaturas(Assinatura[] assinaturas) {
        System.out.println("\n--- LISTA DE ASSINATURAS ---");
        
        if (assinaturas.length == 0) {
            System.out.println("Nenhuma assinatura cadastrada.");
            return;
        }
        
        for (Assinatura assinatura : assinaturas) {
            System.out.println("ID: " + assinatura.getId());
            System.out.println("Nome: " + assinatura.getNome());
            System.out.println("Email: " + assinatura.getEmail());
            System.out.println("----------------------");
        }
    }
}
