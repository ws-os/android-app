package fr.gaulupeau.apps.Poche.tts;

/**
 * Text To Speech (TTS) Text Interface.
 */
public interface TextInterface {
    void    restoreCurrent();
    String  getText(int relativeIndex);
    boolean next();
    boolean fastForward();
    boolean rewind();
    boolean skipToNext();
    boolean skipToPrevious();
    float   getTime();
    float   getTotalDuration();
}
