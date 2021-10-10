package Programs;
//text to speech 
import java.util.Locale; 
import javax.speech.Central; 
import javax.speech.synthesis.Synthesizer; 
import javax.speech.synthesis.SynthesizerModeDesc; 
public class TextSpeech {

	public static void main(String[] args) {
		try 
        { 
            // set property as Kevin Dictionary 
            System.setProperty("freetts.voices", 
                "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");  
                  
            // Register Engine 
            Central.registerEngineCentral 
                ("com.sun.speech.freetts.jsapi.FreeTTSEngineCentral"); 
  
            // Create a Synthesizer 
            Synthesizer synthesizer =                                          
                Central.createSynthesizer(new SynthesizerModeDesc(Locale.US));      
      
            // Allocate synthesizer 
            synthesizer.allocate();         
              
            // Resume Synthesizer 
            synthesizer.resume();     
              
            // speaks the given text until queue is empty. 
            synthesizer.speakPlainText("my", null);      
            synthesizer.speakPlainText("name", null);   
            synthesizer.speakPlainText("is", null);   
            synthesizer.speakPlainText("sagar", null);   
            
            synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY); 
              
            // Deallocate the Synthesizer. 
            synthesizer.deallocate();                                  
        }  
		 catch (Exception e)  
        { 
            e.printStackTrace(); 
        } 

	}

}
