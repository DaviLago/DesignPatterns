package br.com.coffee.adapter.adpter;

import br.com.coffee.adapter.component.Empregado;
import javax.swing.tree.DefaultMutableTreeNode;

public class EmpregadoAdpter {
    
    public DefaultMutableTreeNode adaptToTreeModel(Empregado empregado) throws Exception {
        DefaultMutableTreeNode noPai = new DefaultMutableTreeNode(empregado.getNome());
        try {
            empregado.getEmpregados().forEach(k -> {
                try {
                    noPai.add(  adaptToTreeModel((Empregado) k) );
                } catch (Exception e) {}
            });
        } catch (Exception e) {}
        return noPai;
    }

}
