 let validator = { 
    handleSubmit:(event)=>{
        event.preventDefault(); //Previnir o comportamento padrão do formulário (enviar)
        let send = true; //Enviar o formulário 

        let inputs = form.querySelectorAll('input'); 

        validator.clearErros(); 
        
        for(let i=0; i < inputs.length; i++){  //Verificar os campos individualmente (inputs)
            let input = inputs[i];
          let check =   validator.checkInput(input); 
          if(check !== true){  //Verificar se os data-rules(regras) estão ok
            send = false; //Em caso de erro não enviar o forms
            validator.showError(input, check);
            

          }
        }
        
        if(send) {  
            form.submit();
        }

    },
    checkInput:(input)=>{ 
        let rules =  input.getAttribute('data-rules');

        if(rules !== null){
            rules = rules.split('|'); 
            for(let k in rules){ 
                let rDetails = rules[k].split('=');

                switch(rDetails[0]){ 
                    case 'required':
                        if(input.value == ''){
                            return 'Campo não pode ser vazio.';
                        }
                    break;
                    case 'min':
                        if(input.value.length < rDetails[1]) {
                            return 'Campo tem que ter pelo menos '+rDetails[1]+' caracteres';
                        }
                    break;
                }
            }
        } 
        return true;
    },
    showError:(input,error)=> { //Função para exibir o error
        input.style.borderColor = '#FF0000';

        let errorElement = document.createElement('div');
        errorElement.classList.add('error');
        errorElement.innerHTML = error;

        input.parentElement.insertBefore(errorElement,input.ElementSibling);


    },
    clearErros:()=> { //Função para limpar os erros
        let inputs = form.querySelectorAll('input');
        for(let i=0; i < inputs.length; i++){
            inputs[i].style = '';
        }

        let errorElements = document.querySelectorAll('.error');                    
        for(let i=0; i < errorElements.length; i++){    
            errorElements[i].remove();
        }
    }

};

let form = document.querySelector('.validator'); //Pegar a classe do formulario geral
form.addEventListener('submit',validator.handleSubmit) //Validar informações



//MASCARA DO CPF
const input = document.querySelector('.cpf')

input.addEventListener('keypress', () => {
    let inputLength = input.value.length

    // MAX LENGHT 14  CPF
    if (inputLength == 3 || inputLength == 7) {
        input.value += '.'
    }else if (inputLength == 11) {
        input.value += '-'
    }
})

//VALIDAÇÃO DE SENHA
var password = document.getElementById("password")
  , confirm_password = document.getElementById("confirm_password");

function validatePassword(){
  if(password.value != confirm_password.value) {
    confirm_password.setCustomValidity("Senhas diferentes!");
  } else {
    confirm_password.setCustomValidity('');
  }
}

password.onchange = validatePassword;
confirm_password.onkeyup = validatePassword;



