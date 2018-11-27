package br.com.coffee.adapter.view;

import br.com.coffee.adapter.adpter.EmpregadoAdpter;
import br.com.coffee.adapter.component.Colaborador;
import br.com.coffee.adapter.component.Coordenador;
import br.com.coffee.adapter.component.Empregado;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdapterUi extends JFrame {

    private JScrollPane jScrollPane1;
    private JTree jTree1;

    public AdapterUi() {
        initComponents();
    }

    private void initComponents() {

        jScrollPane1 = new JScrollPane();
        jTree1 = new JTree();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        DefaultMutableTreeNode treeNode1;
        try {
            treeNode1 = new EmpregadoAdpter().adaptToTreeModel(getEmpregados());
            jTree1.setModel(new DefaultTreeModel(treeNode1));
            jScrollPane1.setViewportView(jTree1);
        } catch (Exception ex) {
            Logger.getLogger(AdapterUi.class.getName()).log(Level.SEVERE, null, ex);
        }

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                                .addContainerGap())
        );

        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }

    private Empregado getEmpregados() throws Exception {

        //Utilizando Composite
        Empregado noh1 = new Coordenador("Adriana", "Diretor");

        Empregado noh2 = new Coordenador("Davi", "CTO");
        Empregado noh3 = new Coordenador("Mileny", "Coordenador");
        Empregado noh4 = new Colaborador("Kaique", "Desenvolvedor JR");
        noh3.add(noh4);
        noh2.add(noh3);

        noh3 = new Coordenador("Igor", "Supervisor");
        noh4 = new Colaborador("Vinicius", "Desenvolvedor SR");
        noh3.add(noh4);
        noh2.add(noh3);

        noh3 = new Coordenador("Rosana", "Superintendente");
        noh4 = new Colaborador("Aline", "Desenvolvedor PL");
        noh3.add(noh4);
        noh2.add(noh3);
        noh1.add(noh2);

        noh2 = new Coordenador("Thiago", "CEO");
        noh3 = new Coordenador("Alice", "Coordenador");
        noh4 = new Colaborador("Lucas", "Marketing");
        noh3.add(noh4);
        noh2.add(noh3);
        noh1.add(noh2);

        noh2 = new Coordenador("Luna", "CFO");
        noh3 = new Coordenador("Sofia", "Coordenador");
        noh4 = new Colaborador("Hugo", "Contador");
        noh3.add(noh4);
        noh2.add(noh3);
        noh1.add(noh2);

        return noh1;
    }

    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdapterUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(() -> {
            new AdapterUi().setVisible(true);
        });
    }


}
