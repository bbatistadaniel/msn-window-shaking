
# MsnWindowShaker

A simple Java utility to add a "window shaking" effect to any GUI window, similar to the old MSN Messenger alert style.

## Features

- Shake any `java.awt.Window` for a specified duration.
- Control the intensity (shake factor) and speed of the shake.
- Great for adding playful effects to your Java Swing or AWT applications.

## Installation

This project uses [Maven](https://maven.apache.org/) as its build tool. To install the project, simply clone the repository and build using Maven.

```bash
git clone https://github.com/bbatistadaniel/msn-window-shaking.git
cd msn-window-shaking
mvn install
```

## Usage

To use the `MsnWindowShaker` class, simply call its static method `shakeWindow` with the required parameters:

```java
import br.com.bbatistadaniel.MsnWindowShaker;
import javax.swing.*;

public class TestWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test Window");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Shakes the window with a shake factor of 10, duration of 500 ms, and interval of 20 ms
        MsnWindowShaker.shakeWindow(frame, 10, 500, 20);
    }
}
```

### Parameters:

- `windowToShake`: The `Window` object (e.g., a `JFrame`) you want to shake.
- `shakeFactor`: How far the window moves in pixels during each shake.
- `durationInMilliseconds`: How long the shaking effect should last.
- `intervalBetweenMovingInMilliseconds`: How fast the window should move between positions.

## Contributing

Contributions are welcome! Feel free to fork the repository, make changes, and submit a pull request. Whether it's fixing bugs, adding features, or improving documentation, all contributions are appreciated.

## License

This project is licensed under the GNU General Public License v3.0 - see the [LICENSE](LICENSE) file for details.
```
