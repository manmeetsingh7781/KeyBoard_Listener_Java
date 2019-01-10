  
  // Listen to JFrame
  private static void addKeyboardListener(JComponent component, int keyCode, boolean keyRelease,String id, ActionListener actionListener)
        {

           // How and where to get the input from
           InputMap inputMap = component.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);

           // Get the data
           ActionMap actionMap = component.getActionMap();

           // Put the data and bind it with the method
           inputMap.put(KeyStroke.getKeyStroke(keyCode, 0, keyRelease), id);

           // Create a method to use it when pressed the key
           
           actionMap.put(id, new AbstractAction() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   actionListener.actionPerformed(e);
               }
           });

}
