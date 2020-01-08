package Forms;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SudokuUI extends javax.swing.JFrame {

    private JButton[][] buttons;
    private ActionListener[][] actionListener;
    private JPanel[][] blocks;
    private Sudoku sudoku;
    private int gameMode;
    private int grid;
    private boolean paused;
    private final StopWatch stopWatch;

    /** Creates new form UI */
    public SudokuUI() {
        sudoku = new Sudoku();
        gameMode = Sudoku.GAME_MODE_MEDIUM;
        grid = Sudoku.GRID_9X9;
        stopWatch = new StopWatch();
        paused = false;
        initComponents();
        initialize();
        startTimer();
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        base = new javax.swing.JPanel();
        options = new javax.swing.JPanel();
        newGameBut = new javax.swing.JButton();
        resetGameBut = new javax.swing.JButton();
        timeLabel = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        holder = new javax.swing.JPanel();
        board = new javax.swing.JPanel();
        menue = new javax.swing.JMenuBar();
        game = new javax.swing.JMenu();
        newGame = new javax.swing.JMenuItem();
        resetGame = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        exit = new javax.swing.JMenuItem();
        LevMenu = new javax.swing.JMenu();
        beginner = new javax.swing.JRadioButtonMenuItem();
        intermediator = new javax.swing.JRadioButtonMenuItem();
        expert = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sudoku");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(500, 500));
        setUndecorated(true);

        base.setBackground(new java.awt.Color(204, 204, 204));
        base.setAlignmentX(0.0F);
        base.setAlignmentY(0.0F);

        options.setBackground(new java.awt.Color(255, 255, 255));

        newGameBut.setBackground(new java.awt.Color(255, 255, 255));
        newGameBut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        newGameBut.setText("New Game");
        newGameBut.setMargin(new java.awt.Insets(0, 0, 0, 0));
        newGameBut.setMaximumSize(new java.awt.Dimension(63, 19));
        newGameBut.setMinimumSize(new java.awt.Dimension(63, 19));
        newGameBut.setPreferredSize(new java.awt.Dimension(63, 19));
        newGameBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameButActionPerformed(evt);
            }
        });

        resetGameBut.setBackground(new java.awt.Color(255, 255, 255));
        resetGameBut.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        resetGameBut.setText("Reset Game");
        resetGameBut.setMargin(new java.awt.Insets(0, 0, 0, 0));
        resetGameBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetGameButActionPerformed(evt);
            }
        });

        timeLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(51, 51, 51));
        timeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        timeLabel.setText("00:00:000");
        timeLabel.setIconTextGap(0);

        submit.setBackground(new java.awt.Color(255, 255, 255));
        submit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout optionsLayout = new javax.swing.GroupLayout(options);
        options.setLayout(optionsLayout);
        optionsLayout.setHorizontalGroup(
            optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsLayout.createSequentialGroup()
                .addComponent(newGameBut, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resetGameBut, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168)
                .addComponent(timeLabel)
                .addContainerGap())
        );
        optionsLayout.setVerticalGroup(
            optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(newGameBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resetGameBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(timeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        holder.setBackground(new java.awt.Color(255, 255, 255));
        holder.setAlignmentX(0.0F);
        holder.setAlignmentY(0.0F);
        holder.setLayout(new java.awt.GridLayout(1, 1));

        board.setBackground(new java.awt.Color(255, 255, 255));
        board.setAlignmentX(0.0F);
        board.setAlignmentY(0.0F);
        board.setMinimumSize(new java.awt.Dimension(100, 100));
        board.setPreferredSize(new java.awt.Dimension(100, 100));
        board.setLayout(new java.awt.GridLayout(9, 9));
        holder.add(board);

        javax.swing.GroupLayout baseLayout = new javax.swing.GroupLayout(base);
        base.setLayout(baseLayout);
        baseLayout.setHorizontalGroup(
            baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, baseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(holder, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1176, Short.MAX_VALUE)
                    .addComponent(options, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        baseLayout.setVerticalGroup(
            baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(options, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(holder, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
                .addContainerGap())
        );

        menue.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                menueMouseDragged(evt);
            }
        });
        menue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menueMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                menueMouseReleased(evt);
            }
        });

        game.setText("Game");

        newGame.setText("New Game 9 X 9");
        newGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameActionPerformed(evt);
            }
        });
        game.add(newGame);

        resetGame.setText("Reset Game");
        resetGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetGameActionPerformed(evt);
            }
        });
        game.add(resetGame);
        game.add(jSeparator1);

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        game.add(exit);

        menue.add(game);

        LevMenu.setText("Level");

        beginner.setText("Beginner");
        beginner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beginnerActionPerformed(evt);
            }
        });
        LevMenu.add(beginner);

        intermediator.setSelected(true);
        intermediator.setText("Intermediator");
        intermediator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intermediatorActionPerformed(evt);
            }
        });
        LevMenu.add(intermediator);

        expert.setText("Expert");
        expert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expertActionPerformed(evt);
            }
        });
        LevMenu.add(expert);

        menue.add(LevMenu);

        setJMenuBar(menue);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void newGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameActionPerformed
        grid = Sudoku.GRID_9X9;
        int[][] puzzle = sudoku.getNewPuzzle(grid, gameMode);
        createBoard(puzzle);
    }//GEN-LAST:event_newGameActionPerformed

    private void resetGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetGameActionPerformed
        int[][] puzzle = sudoku.resetPuzzle();
        createBoard(puzzle);
    }//GEN-LAST:event_resetGameActionPerformed

    private void intermediatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intermediatorActionPerformed
        gameMode = Sudoku.GAME_MODE_MEDIUM;
        int[][] puzzle = sudoku.getNewPuzzle(grid, gameMode);
        createBoard(puzzle);
    }//GEN-LAST:event_intermediatorActionPerformed

    private void expertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expertActionPerformed
        gameMode = Sudoku.GAME_MODE_EXPERT;
        int[][] puzzle = sudoku.getNewPuzzle(grid, gameMode);
        createBoard(puzzle);
    }//GEN-LAST:event_expertActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void beginnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beginnerActionPerformed
        gameMode = Sudoku.GAME_MODE_EASY;
        int[][] puzzle = sudoku.getNewPuzzle(grid, gameMode);
        createBoard(puzzle);
    }//GEN-LAST:event_beginnerActionPerformed

    private void resetGameButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetGameButActionPerformed
        int[][] puzzle = sudoku.resetPuzzle();
        createBoard(puzzle);
    }//GEN-LAST:event_resetGameButActionPerformed

    private void newGameButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameButActionPerformed
        int[][] puzzle = sudoku.getNewPuzzle(grid, gameMode);
        createBoard(puzzle);
    }//GEN-LAST:event_newGameButActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        int Score = 100;
        if (!isAnsComplete()) {
            JOptionPane.showMessageDialog(this, "Please complete your answer.");
            Score = Score - 5;
        } else {
            stopWatch.stop();
            boolean isAnsCorrect = sudoku.check(getAns());
            String messageStr = "";
            if (isAnsCorrect) {
                messageStr = "Congratulation You have won the Game in " + timeLabel.getText()
                        + "\n and your score is " + Score; 
                     
            } else {
                messageStr = "Sorry You have failed. ";
            }
            showMessage(messageStr);
        }
    }//GEN-LAST:event_submitActionPerformed

    int xx;
    int yy;
    
    private void menueMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menueMousePressed
        // TODO add your handling code here:
        setOpacity((float)0.8);
        this.setOpacity((float)0.8);
        xx=evt.getX();
        yy=evt.getY();
    }//GEN-LAST:event_menueMousePressed

    private void menueMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menueMouseReleased
        // TODO add your handling code here:
        setOpacity((float)1.0);
        this.setOpacity((float)1.0);
    }//GEN-LAST:event_menueMouseReleased

    private void menueMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menueMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - yy );
    }//GEN-LAST:event_menueMouseDragged

    private void createBoard(int[][] puzzle) {
        board.removeAll();
        grid = puzzle.length;
        blocks = new JPanel[grid][grid];
        buttons = new JButton[grid][grid];
        actionListener = new ActionListener[grid][grid];
        board.setLayout(new GridLayout(grid, grid, 3, 3));

        int rowsInGrid = grid == 9 ? 3 : 2;

        for (int i = 0; i < grid; i++) {
            for (int j = 0; j < grid; j++) {
                blocks[i][j] = new JPanel();
                buttons[i][j] = new JButton();
                String text = "";
                if (0 < puzzle[i][j] && puzzle[i][j] <= grid) {
                    text += puzzle[i][j];
                } else {
                    final JButton tempbutton = buttons[i][j];
                    final JPanel tempBlock = blocks[i][j];
                    actionListener[i][j] = new ActionListener() {

                        public void actionPerformed(ActionEvent e) {
                            viewInputs(tempBlock, tempbutton, grid);
                        }
                    };
                    buttons[i][j].addActionListener(actionListener[i][j]);
                }
                buttons[i][j].setText(text);
                buttons[i][j].setFont(new java.awt.Font("Tahoma", 0, 24));

                if (((0 <= i && i < rowsInGrid) || (rowsInGrid * 2 <= i && i < grid)) && (3 <= j && j < 6)) {
                    buttons[i][j].setBackground(new java.awt.Color(255,198,235));
                } else if ((rowsInGrid <= i && i < rowsInGrid * 2) && ((0 <= j && j < 3) || (6 <= j && j < 9))) {
                    buttons[i][j].setBackground(new java.awt.Color(255,198,235));
                } else {
                    buttons[i][j].setBackground(new java.awt.Color(171,76,137));
                }
                blocks[i][j].setLayout(new GridLayout(1, 1));
                blocks[i][j].add(buttons[i][j]);
                board.add(blocks[i][j]);
            }
        }

        holder.removeAll();
        holder.add(board);
        board.repaint();
        holder.repaint();
        this.setVisible(true);
        stopWatch.start();
    }

    private void initialize() {
        int[][] puzzle = sudoku.getNewPuzzle(grid, gameMode);
        createBoard(puzzle);
    }

    private void viewInputs(JPanel block, JButton inputButtton, int numOfInput) {
        JPanel inputs = new Inputs(this, block, inputButtton, numOfInput);
        block.remove(inputButtton);
        block.add(inputs);
        this.setVisible(true);
    }

    public void setInput(String ans, JPanel block, JButton inputButtton) {
        block.removeAll();
        inputButtton.setText(ans);
        inputButtton.setFont(new java.awt.Font("Tahoma", 1, 24));
        block.add(inputButtton);
        this.repaint();
    }

    private int[][] getAns() {
        int ans[][] = new int[grid][grid];

        for (int i = 0; i < grid; i++) {
            for (int j = 0; j < grid; j++) {
                try {
                    ans[i][j] = Integer.parseInt(buttons[i][j].getText());
                } catch (NumberFormatException e) {
                    ans[i][j] = 0;
                }
            }
        }

        return ans;
    }

    private boolean isAnsComplete() {
        boolean isAnsComplete = true;
        for (int i = 0; i < grid; i++) {
            for (int j = 0; j < grid; j++) {
                try {
                    Integer.parseInt(buttons[i][j].getText());
                } catch (NumberFormatException e) {
                    isAnsComplete = false;
                    break;
                }
            }
        }
        return isAnsComplete;
    }

    private void showMessage(String message) {
        JLabel messageLabel = new JLabel();
        messageLabel.setFont(new java.awt.Font("Tahoma", 1, 20));
        messageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        messageLabel.setText(message);
        holder.removeAll();
        holder.add(messageLabel);
        holder.repaint();
        this.setVisible(true);

    }

    private void startTimer() {
        Thread thread = new Thread(new Runnable() {

            public void run() {
                stopWatch.start();
                while (true) {
                    if (!paused) {
                        final String timeString = new SimpleDateFormat("mm:ss:SSS").format(stopWatch.getElapsedTime());
                        timeLabel.setText("" + timeString);
                    }
                }
            }
        });
        thread.start();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu LevMenu;
    private javax.swing.JPanel base;
    private javax.swing.JRadioButtonMenuItem beginner;
    private javax.swing.JPanel board;
    private javax.swing.JMenuItem exit;
    private javax.swing.JRadioButtonMenuItem expert;
    private javax.swing.JMenu game;
    private javax.swing.JPanel holder;
    private javax.swing.JRadioButtonMenuItem intermediator;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuBar menue;
    private javax.swing.JMenuItem newGame;
    private javax.swing.JButton newGameBut;
    private javax.swing.JPanel options;
    private javax.swing.JMenuItem resetGame;
    private javax.swing.JButton resetGameBut;
    private javax.swing.JButton submit;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables
}
