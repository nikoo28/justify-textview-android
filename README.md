Android supports 3 types of text alignment
- Left
- Right
- Center

Somehow, the guys at Google thought that justified alignment was not necessary. But there can be many chances where you want to get your text justified.
There are many ways available if you search for it. I found a really simple way to do it and believe me, it can't get simpler than this.

Just import the two files "TextJustifyUtils.java" and "TextViewEx.java" in your project.

See the layout file in the project to see how to use the TextViewEx for justifying text

Once the xml is done, go to your MainActivity

- Define a variable and set justify to be true,

TextViewEx changed = (TextViewEx) findViewById(R.id.changed);
changed.setText(getResources().getString(R.string.lorum_ipsum),true);

That's it.
You can use all the properties of TextView class as it extends the same.

Just copy the sample project in your workspace and run it on your android device to see it in action.