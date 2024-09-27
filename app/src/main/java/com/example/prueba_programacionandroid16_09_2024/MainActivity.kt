import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.Scaffold
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.material3.Icon
import com.example.prueba_programacionandroid16_09_2024.R
import com.example.prueba_programacionandroid16_09_2024.ui.theme.Prueba_ProgramacionAndroid16_09_2024Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Prueba_ProgramacionAndroid16_09_2024Theme() {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BusinessCardScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun BusinessCardScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Text(
            text = "Mauricio Ortega",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF00BCD4)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Image(
            painter = painterResource(id = R.drawable.fotos_para_perfil_do_whatsapp13),
            contentDescription = null,
            modifier = Modifier.size(100.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))


        Box(
            modifier = Modifier
                .background(Color(0xFFFFC800))
                .padding(8.dp)
        ) {
            Text(
                text = "Programador",
                color = Color.Black
            )
        }

        Spacer(modifier = Modifier.height(30.dp))


        ContactInfo(iconRes = R.drawable.icono_de_telefono, contactInfo = "+56 9 9210 3938")
        ContactInfo(iconRes = R.drawable.icono_de_correo, contactInfo = "m.ortega51@santotomas.cl")
        ContactInfo(iconRes = R.drawable.icono_de_localizacion_2_0, contactInfo = "Arica y Parinacota, Chile")
    }
}

@Composable
fun ContactInfo(iconRes: Int, contactInfo: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(8.dp)
    ) {

        Icon(
            painter = painterResource(id = iconRes),
            contentDescription = null,
            modifier = Modifier.size(30.dp),
            tint = Color.Red
        )
        Spacer(modifier = Modifier.width(8.dp))


        Text(text = contactInfo, fontSize = 16.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardScreenPreview() {
    Prueba_ProgramacionAndroid16_09_2024Theme() {
        BusinessCardScreen()
    }
}
