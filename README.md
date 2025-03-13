# Sistema de Gestão de Pedidos - Implementação com Princípios SOLID

Este repositório contém uma implementação de um sistema para gerenciar pedidos de um e-commerce, aplicando os princípios SOLID de design de software. O sistema permite criar e processar pedidos, aplicar descontos baseados no tipo de cliente, enviar notificações quando um pedido for concluído e registrar os pedidos em um banco de dados.

## Objetivo

O objetivo deste exercício é mostrar como aplicar os princípios SOLID para criar um código organizado, flexível e de fácil manutenção. O código foi projetado de maneira que novos tipos de desconto, notificações ou até meios de pagamento possam ser facilmente adicionados sem modificar o código existente.

## Princípios SOLID aplicados

1. **Princípio da Responsabilidade Única (SRP)**: Cada classe tem uma única responsabilidade bem definida.
2. **Princípio Aberto-Fechado (OCP)**: O código pode ser estendido sem modificar a implementação existente, especialmente no que se refere a descontos e notificações.
3. **Princípio da Substituição de Liskov (LSP)**: As subclasses podem substituir suas classes base sem afetar o funcionamento do sistema.
4. **Princípio da Segregação de Interfaces (ISP)**: As interfaces são bem definidas, com métodos que são utilizados apenas por classes que realmente precisam deles.
5. **Princípio da Inversão de Dependência (DIP)**: O sistema depende de abstrações (interfaces) e não de implementações concretas.

## Estrutura do Sistema

O sistema foi desenvolvido utilizando Java e segue a seguinte arquitetura:

1. **Classe Pedido**: Representa um pedido no sistema.
2. **Interface DescontoStrategy e suas Implementações**:
    - `DescontoClienteComum`: Aplica um desconto de 5% para clientes comuns.
    - `DescontoClienteVip`: Aplica um desconto de 10% para clientes VIP.
3. **Interface Notificador e suas Implementações**:
    - `EmailNotificador`: Envia notificações por e-mail.
    - `SmsNotificador`: Envia notificações por SMS.
4. **Classe PedidoRepository**: Responsável por salvar pedidos no banco de dados.
5. **Classe ProcessadorDePedidos**: Gerencia a criação e finalização de pedidos, utilizando os serviços de desconto e notificação.

## Diagrama UML
![Untitled diagram-2025-03-08-004756](https://github.com/user-attachments/assets/22ea800d-4c24-4e6c-82c4-56349028c384)

